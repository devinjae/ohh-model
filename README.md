# OHH Model

A lightweight Java implementation of the [Open Hand History (OHH)](https://hh-specs.handhistory.org/) specification.

Provides type-safe Java models with JSON serialization and deserialization using Jackson.

## Features

- Java 17+
- OHH-compliant data models
- JSON serialization and deserialization
- Type-safe enums

## Installation

```groovy
dependencies {
    implementation 'io.github.devinjae:ohh-model:0.1.0'
}
```

## Usage

```java
// Serialize an OHH object to JSON
String json = OHHJson.toJson(ohh);

// Deserialize JSON to an OHH object
OHH ohh = OHHJson.fromJson(json);
```

## Specification
- Target specification: OHH 1.4.9
- Based on the [Open Hand History Specification](https://hh-specs.handhistory.org/).