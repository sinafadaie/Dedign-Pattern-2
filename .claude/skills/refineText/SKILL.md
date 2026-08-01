---
name: refineText
description: Convert text files in a selected package to individual, readable markdown files.
arg-hint: <package-path>
---

# refineText

When invoked, the user provides a package path relative to `src/` (e.g., `decorator/Mosh`).

## Steps

### 1. Resolve the package
Resolve to `src/<path>/`. If ambiguous, list matching directories and ask the user.

### 2. List text files
List all text-format files in that directory (`.java`, `.txt`, `.xml`, `.properties`, `.json`, etc.) — non-recursive, just the single directory.

### 3. Process each file
For each text file found:

1. **Read** the file
2. **Convert** it to a markdown file with the same base name (e.g., `Stream.java` → `Stream.md`)
3. **Write** the `.md` file into the same directory

The generated `.md` file should make the original content more readable:
- Add a clear heading with the file name and its role
- Preserve the original code/content but format it nicely in markdown
- Add brief explanatory prose that explains what the code does and why it's structured that way
- Use markdown features (headings, code blocks, lists) to improve readability

## Rules
- One `.md` file per source file — never merge files together.
- Keep the original filename as the `.md` filename (just change the extension).
- Write for someone learning — clear, educational, not a dump of the original text.
- Identify the design pattern role each file plays (e.g., "This is the component interface that all decorators implement").
- Use proper markdown code fences with language tags for code blocks.
