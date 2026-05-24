# 📚 TachiyomiX Index

Index file format for TachiyomiX based extension stores.
It can be represented as Protobuf or JSON, and host apps should support both formats.

## 📦 Protobuf

```proto
syntax = "proto3";

message Index {
  // Display name of the store (e.g. "Antsy's Epic Store").
  string name = 1;

  // Short identifier used to represent the store (e.g. "AES").
  optional string badgeLabel = 2;

  // Public signing key used to verify extension authenticity.
  string signingKey = 3;

  // Contact and community information for the store.
  optional Contact contact = 4;

  // List of all extensions published by this store.
  repeated Extension extensions = 5;
}

message Contact {
  // Official website URL.
  optional string website = 1;

  // Discord invite or server URL.
  optional string discord = 2;
}

message Extension {
  // Extension display name.
  string name = 1;

  // Unique package name of the extension.
  string packageName = 2;

  // Downloadable resources for this extension.
  Resources resources = 3;

  // Version of the extension API in MAJOR.MINOR format.
  string extensionLib = 4;

  // Version code of the extension build.
  int32 versionCode = 5;

  // Sources provided by this extension.
  repeated Source sources = 6;
}

message Resources {
  // Direct APK download URL.
  string apkUrl = 1;

  // Icon image URL.
  string iconUrl = 2;
}

message Source {
  // Unique source identifier.
  int64 id = 1;

  // Display name of the source.
  string name = 2;

  // Primary language code (e.g. "en", "ja", "pt-BR").
  string language = 3;

  // Main website URL of the source.
  string homeUrl = 4;

  // Alternative home URLs for the source.
  repeated string mirrorUrls = 5;

  // Indicates the highest maturity level of the source's content.
  ContentRating contentRating = 6;
}

enum ContentRating {
  // Suitable for general audiences.
  CONTENT_RATING_SAFE = 0;

  // May include suggestive themes, partial nudity,
  // or fanservice, but not explicit sexual acts.
  CONTENT_RATING_SUGGESTIVE = 1;

  // Contains explicit sexual themes or nudity
  // intended for mature audiences.
  CONTENT_RATING_EROTICA = 2;

  // Contains explicit pornographic or sexually graphic content.
  CONTENT_RATING_PORNOGRAPHIC = 3;
}
```

## 📦 JSON

```json
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "type": "object",
  "properties": {
    "name": {
      "type": "string",
      "description": "Display name of the store (e.g. \"Antsy's Epic Store\")."
    },
    "badgeLabel": {
      "type": "string",
      "description": "Short identifier used to represent the store (e.g. \"AES\")."
    },
    "signingKey": {
      "type": "string",
      "description": "Public signing key used to verify extension authenticity."
    },
    "contact": {
      "type": "object",
      "description": "Contact and community information for the store.",
      "properties": {
        "website": {
          "type": "string",
          "description": "Official website URL."
        },
        "discord": {
          "type": "string",
          "description": "Discord invite or server URL."
        }
      }
    },
    "extensions": {
      "type": "array",
      "description": "List of all extensions published by this store.",
      "items": {
        "type": "object",
        "properties": {
          "name": {
            "type": "string",
            "description": "Extension display name."
          },
          "packageName": {
            "type": "string",
            "description": "Unique package name of the extension."
          },
          "resources": {
            "type": "object",
            "description": "Downloadable resources for this extension.",
            "properties": {
              "apkUrl": {
                "type": "string",
                "description": "Direct APK download URL."
              },
              "iconUrl": {
                "type": "string",
                "description": "Icon image URL."
              }
            },
            "required": ["apkUrl", "iconUrl"]
          },
          "extensionLib": {
            "type": "string",
            "description": "Version of the extension API in MAJOR.MINOR format."
          },
          "versionCode": {
            "type": "integer",
            "description": "Version code of the extension build."
          },
          "sources": {
            "type": "array",
            "description": "Sources provided by this extension.",
            "items": {
              "type": "object",
              "properties": {
                "id": {
                  "type": "integer",
                  "description": "Unique source identifier."
                },
                "name": {
                  "type": "string",
                  "description": "Display name of the source."
                },
                "language": {
                  "type": "string",
                  "description": "Primary language code (e.g. 'en', 'ja', 'pt-BR')."
                },
                "homeUrl": {
                  "type": "string",
                  "description": "Main website URL of the source."
                },
                "mirrorUrls": {
                  "type": "array",
                  "description": "Alternative home URLs for the source.",
                  "items": {
                    "type": "string"
                  }
                },
                "contentRating": {
                  "type": "string",
                  "description": "Indicates the highest maturity level of the source's content.",
                  "enum": [
                    "SAFE",
                    "SUGGESTIVE",
                    "EROTICA",
                    "PORNOGRAPHIC"
                  ]
                }
              },
              "required": [
                "id",
                "name",
                "language",
                "homeUrl",
                "mirrorUrls",
                "contentRating"
              ]
            }
          }
        },
        "required": [
          "name",
          "packageName",
          "resources",
          "extensionLib",
          "versionCode",
          "sources"
        ]
      }
    }
  },
  "required": [
    "name",
    "signingKey",
    "extensions"
  ]
}
```
