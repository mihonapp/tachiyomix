package mihonx.js

public interface JSEngine: AutoCloseable {

    public suspend fun compile(script: String): ByteArray

    public suspend fun execute(script: String): Any?

    public suspend fun execute(bytecode: ByteArray): Any?
}
