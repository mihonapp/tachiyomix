package mihonx.js

/**
 * Engine for evaluating JavaScript in sources.
 *
 * The engine holds native resources and must be closed once it's no longer
 * needed, preferably through [use][kotlin.use].
 *
 * @since mihonx 0.1.0
 */
public interface JSEngine : AutoCloseable {

    /**
     * Compiles JavaScript code into bytecode that can be evaluated later.
     *
     * Useful to avoid paying the compilation cost every time the same script is
     * executed. The produced bytecode is not guaranteed to be compatible across
     * engine implementations or versions, so it shouldn't be persisted.
     *
     * @since mihonx 0.1.0
     * @param script JavaScript to compile.
     * @return the compiled bytecode.
     * @throws JSEngineException if the script fails to compile.
     */
    public suspend fun compile(script: String): ByteArray

    /**
     * Evaluates arbitrary JavaScript code and returns its result.
     *
     * @since mihonx 0.1.0
     * @param script JavaScript to execute.
     * @return result of the JavaScript code, or `null` if it doesn't return a value.
     * @throws JSEngineException if the script fails to compile or execute.
     */
    public suspend fun execute(script: String): Any?

    /**
     * Evaluates previously compiled JavaScript bytecode and returns its result.
     *
     * @see compile
     * @since mihonx 0.1.0
     * @param bytecode bytecode to execute.
     * @return result of the JavaScript code, or `null` if it doesn't return a value.
     * @throws JSEngineException if the bytecode fails to execute.
     */
    public suspend fun execute(bytecode: ByteArray): Any?
}
