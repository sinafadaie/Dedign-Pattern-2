# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run

This is an IntelliJ-only project with no build system (no Maven/Gradle). Compile and run through IntelliJ IDEA.

- **JDK**: 21 (homebrew-21)
- **Source root**: `src/`
- **Output**: `out/`

To compile and run a single pattern demo from the CLI:

```bash
# Compile all sources
javac -d out -sourcepath src $(find src -name "*.java")

# Run a specific main class (example: Decorator with Mosh)
java -cp out decorator.Mosh.Main
```

## Architecture

This project contains implementations of GoF structural design patterns, following Mosh Hamedani's "Design Patterns - Part 2" course.

### Package layout per pattern

Each pattern follows this convention:

```
src/<pattern>/
├── *.java              # My own implementation
├── Main.java           # Demo entry point
├── Mosh/               # Instructor's reference implementation
│   ├── *.java
│   └── Main.java
└── exercise/           # Course exercise solution
    └── *.java
```

### Patterns covered

| Pattern | Package | Core idea |
|---------|---------|-----------|
| **Adapter** | `adaptor/` | Convert one interface to another (class adapter via inheritance, object adapter via composition). Exercise: Gmail client adapter |
| **Bridge** | `bridge/` | Separate abstraction from implementation so both can vary independently (e.g., remote controls ↔ devices) |
| **Composite** | `composite/` | Treat individual objects and groups uniformly via a common `Component` interface |
| **Decorator** | `decorator/` | Wrap objects to add behavior dynamically (e.g., compressing/encrypting a stream). Uses a `Stream` interface with decorators accepting a `Stream` via constructor |
| **Facade** | `facade/` | Provide a simplified interface to a complex subsystem (e.g., `NotificationService` wrapping server connection, auth, and message sending) |
| **Flyweight** | `flyweight/` | Share common state across many objects to save memory. Uses a factory with a `HashMap` cache keyed by intrinsic state |
| **Proxy** | `proxy/` | Control access to an object (e.g., lazy loading ebooks, logging proxy). Uses a common interface between real and proxy classes |

### Duplicate exercise directories

The `src/section_X/exercise/` directories contain partial/alternate copies of the exercises that also appear under the pattern-named packages. When making changes to exercises, prefer the pattern-named package versions (e.g., `src/proxy/exercise/` over `src/section_7/exercise/`).

### Code conventions

- No external dependencies — pure Java standard library
- Minimal comments; code is self-documenting
- Each pattern's `Main.java` contains a `main()` method demonstrating usage
- Factory classes in Flyweight use `HashMap` for caching intrinsic state
