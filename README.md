# Kotlin Codebase

This repository is a personal Kotlin codebase for collecting reusable modules, utilities, templates, and best practices across different types of Kotlin development (Android, backend, scripts, etc.).

---

## 📁 Folder Structure

### `utils/`
General-purpose utility classes and functions written in Kotlin.  
Example: Date formatting, file IO helpers, string manipulation, number converters.

---

### `extensions/`
Kotlin extension functions for enhancing standard or Android classes.  
Example: `View.visible()`, `String.toDate()`, `List<T>.averageBy { ... }`

---

### `android-modules/`
Reusable Android components and features.  
Example:  
- Permission request helper  
- Base RecyclerView adapter  
- Custom UI widgets  
- ViewModel wrappers  
- Navigation helpers

---

### `coroutines/`
Utilities, patterns, and examples related to Kotlin Coroutines and Flow.  
Example:  
- Custom coroutine scope utilities  
- Use-cases for `StateFlow` / `SharedFlow`  
- Error handling patterns

---

### `ktor-backend/`
Ktor-based backend modules or microservices.  
Example:  
- Hello World HTTP server  
- REST API templates  
- Authentication middleware  
- JSON serialization config

---

### `scripts/`
Kotlin script files (`.kts`) for automation or quick tasks.  
Example:  
- File renaming tools  
- Log analysis  
- Batch data processing  
- Git hook tools

---

### `templates/`
Project templates or boilerplates for faster development start.  
Example:  
- Android App starter with MVVM  
- Ktor + Exposed + H2 project  
- Command-line Kotlin App base

---

## 📦 Contribution

This is a personal repository but PRs and suggestions are welcome if you find something useful.

## 📜 License

MIT License.
