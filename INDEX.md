# 📚 TachiyomiX Index

Index file format for TachiyomiX based extension stores.
It can be represented as Protobuf or JSON, and host apps should support both formats.

## 📦 Protobuf

```proto
syntax = "proto3";

package tachiyomix;

message Index {
  // Display name of the store (e.g. "Antsy's Epic Store").
  string name = 1;

  // Compact store identifier shown beside plugins (e.g. "AES").
  optional string badgeLabel = 2;

  // Public signing key used to verify extension authenticity.
  string signingKey = 3;

  // Contact and community information for the store.
  Contact contact = 4;

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

  // Unique package identifier of the extension.
  string package = 2;

  // Downloadable resources for this extension.
  Resource resource = 3;

  // Extension API version.
  double extensionLib = 4;

  // Version code of the extension build.
  int32 versionCode = 5;

  // Sources provided by this extension.
  repeated Source sources = 6;
}

message Resource {
  // Direct APK download URL.
  string apk = 1;

  // Icon image URL.
  string icon = 2;
}

message Source {
  // Unique source identifier.
  int64 id = 1;

  // Display name of the source.
  string name = 2;

  // Primary language code (e.g. "en", "ja").
  string language = 3;

  // Main website URL of the source.
  string homeUrl = 4;

  // Mirror URLs used by the source.
  repeated string mirrorUrls = 5;
}

```

## 📦 JSON

```json
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "title": "TachiyomiX Index",
  "type": "object",
  "properties": {
    "name": {
      "type": "string",
      "description": "Display name of the store (e.g. 'Antsy's Epic Store')."
    },
    "badgeLabel": {
      "type": ["string", "null"],
      "description": "Compact store identifier shown beside plugins (e.g. "AES")."
    },
    "signingKey": {
      "type": "string",
      "description": "Public signing key used to verify extension authenticity."
    },
    "contact": {
      "type": ["object", "null"],
      "description": "Contact and community information for the store.",
      "properties": {
        "website": {
          "type": ["string", "null"],
          "description": "Official website URL."
        },
        "discord": {
          "type": ["string", "null"],
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
          "package": {
            "type": "string",
            "description": "Unique package identifier of the extension."
          },
          "resource": {
            "type": "object",
            "description": "Downloadable resources for this extension.",
            "properties": {
              "apk": {
                "type": "string",
                "description": "Direct APK download URL."
              },
              "icon": {
                "type": "string",
                "description": "Icon image URL."
              }
            },
            "required": ["apk", "icon"]
          },
          "extensionLib": {
            "type": "number",
            "description": "Extension API version."
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
                  "description": "Primary language code (e.g. 'en', 'ja')."
                },
                "homeUrl": {
                  "type": "string",
                  "description": "Main website URL of the source."
                },
                "mirrorUrls": {
                  "type": "array",
                  "description": "Mirror URLs used by the source.",
                  "items": {
                    "type": "string"
                  }
                }
              },
              "required": [
                "id",
                "name",
                "language",
                "homeUrl",
                "mirrorUrls"
              ]
            }
          }
        },
        "required": [
          "name",
          "package",
          "resource",
          "extensionLib",
          "versionCode",
          "sources"
        ]
      }
    }
  },
  "required": [
    "name",
    "badgeLabel",
    "signingKey",
    "contact",
    "extensions"
  ]
}
```
