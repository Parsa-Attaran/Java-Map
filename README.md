# MyMap — Custom HashMap Implementation in Java

A simple, lightweight implementation of a generic `Map` data structure in Java, based on hashing. This custom `MyMap<K, V>` supports storing key-value pairs using an array of buckets and separate chaining with linked lists.

---

## Features

- Generic key-value storage (`MyMap<K, V>`)
- `put(key, value)` — inserts or updates key-value pairs
- `get(key)` — retrieves value by key
- `size()` — returns number of key-value pairs
- Handles collisions using **separate chaining**
- Supports insertion at **end of chain**

---

## Project Structure

src/
│
├── MyMap.java         # Main class with put, get, size
├── Entry.java         # Node structure used in bucket chaining
└── MyMapTest.java     # Unit tests using JUnit 5

---

## Example Usage

```java
MyMap<String, String> map = new MyMap<>();
map.put("name", "Alice");
map.put("city", "Paris");
System.out.println(map.get("name")); // Output: Alice
System.out.println(map.size());      // Output: 2
