# 📚 TachiyomiX Index

Index file format for TachiyomiX based extension stores.
It can be represented as JSON or Protobuf, and host apps should support both formats.

## 📦 JSON

```json
{
  "$schema": "https://json-schema.org/draft/2020-12/schema",
  "title": "TachiyomiX Index Schema",
  "type": "object",
  "properties": {
    "name": {
      "type": "string"
    },
    "signingKey": {
      "type": "string"
    },
    "contact": {
      "type": "object",
      "properties": {
        "website": {
          "type": ["string", "null"]
        },
        "discord": {
          "type": ["string", "null"]
        }
      }
    },
    "extensions": {
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "name": {
            "type": "string"
          },
          "package": {
            "type": "string"
          },
          "resource": {
            "type": "object",
            "properties": {
              "apk": {
                "type": "string",
                "format": "uri"
              },
              "icon": {
                "type": "string",
                "format": "uri"
              }
            },
            "required": [
              "apk",
              "icon"
            ]
          },
          "extensionLib": {
            "type": "number"
          },
          "versionCode": {
            "type": "integer"
          },
          "sources": {
            "type": "array",
            "items": {
              "type": "object",
              "properties": {
                "name": {
                  "type": "string"
                },
                "lang": {
                  "type": "string"
                },
                "id": {
                  "type": "string"
                },
                "baseUrl": {
                  "type": "string",
                  "format": "uri"
                }
              },
              "required": [
                "name",
                "lang",
                "id",
                "baseUrl"
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
    "signingKey",
    "contact",
    "extensions"
  ]
}
```

## 📦 Protobuf

```proto
syntax = "proto3";

package tachiyomix;

message Index {
  string name = 1;
  string signingKey = 2;
  Contact contact = 3;
  repeated Extension extensions = 4;
}

message Contact {
  optional string website = 1;
  optional string discord = 2;
}

message Extension {
  string name = 1;
  string package = 2;
  Resource resource = 3;
  double extensionLib = 4;
  int32 versionCode = 5;
  repeated Source sources = 6;
}

message Resource {
  string apk = 1;   // URI as string
  string icon = 2;  // URI as string
}

message Source {
  string name = 1;
  string lang = 2;
  string id = 3;
  string baseUrl = 4; // URI as string
}
```
