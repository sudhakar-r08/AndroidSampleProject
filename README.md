# Android Sample Project

A comprehensive Android application demonstrating modern Android development practices and architectural patterns.

## Features

- **Modern UI**: Built with Material Design 3 guidelines
- **Architecture**: Clean Architecture with MVVM pattern
- **Networking**: REST API integration with Retrofit
- **Dependency Injection**: Dagger Hilt for dependency management
- **Asynchronous Programming**: Kotlin Coroutines and Flow
- **Navigation**: Navigation Component for in-app navigation
- **Testing**: Unit tests and UI tests included

## Screenshots

<!-- Add your app screenshots here -->
| Home Screen | Details Screen | 
|-------------|----------------|
| ![Home](https://raw.githubusercontent.com/sudhakar-r08/AndroidSampleProject/refs/heads/master/Home.png) | ![Details](https://raw.githubusercontent.com/sudhakar-r08/AndroidSampleProject/refs/heads/master/country1.png) | 

## Tech Stack

**Language:** Kotlin

**Architecture:** 
- MVVM (Model-View-ViewModel)
- Clean Architecture
- Repository Pattern

**Libraries & Frameworks:**
- **UI**: Jetpack Compose / View Binding
- **Navigation**: Navigation Component
- **Networking**: Retrofit, OkHttp
- **Database**: Room
- **Dependency Injection**: Dagger Hilt
- **Asynchronous**: Coroutines, Flow
- **Image Loading**: Glide/Coil
- **Testing**: JUnit, Espresso, Mockito

## Prerequisites

- Android Studio Hedgehog | 2023.1.1 or later
- Android SDK 34
- Kotlin 1.9.0 or later
- Gradle 8.0 or later

## Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/sudhakar-r08/AndroidSampleProject.git
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned repository folder
   - Click "OK"

3. **Build the project**
   - Wait for Gradle sync to complete
   - Build the project by clicking Build → Make Project

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press Shift + F10

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/yourpackage/
│   │   │   ├── data/          # Data layer (repositories, data sources)
│   │   │   ├── domain/        # Domain layer (use cases, entities)
│   │   │   ├── presentation/  # Presentation layer (UI, ViewModels)
│   │   │   ├── di/           # Dependency injection modules
│   │   │   └── utils/        # Utility classes
│   │   ├── res/              # Resources (layouts, strings, etc.)
│   │   └── AndroidManifest.xml
│   ├── test/                 # Unit tests
│   └── androidTest/          # Instrumentation tests
├── build.gradle.kts
└── proguard-rules.pro
```

## Configuration

### API Configuration
If your app uses external APIs, create a `local.properties` file in the root directory:

```properties
api.base.url="https://your-api-endpoint.com/"
api.key="your-api-key"
```

### Build Variants
The project supports multiple build variants:
- **Debug**: Development build with logging enabled
- **Release**: Production build with optimizations

## Testing

### Running Unit Tests
```bash
./gradlew test
```

### Running Instrumentation Tests
```bash
./gradlew connectedAndroidTest
```

### Code Coverage
```bash
./gradlew createDebugCoverageReport
```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Code Style
- Follow [Android Kotlin Style Guide](https://developer.android.com/kotlin/style-guide)
- Use [ktlint](https://ktlint.github.io/) for code formatting
- Run `./gradlew ktlintCheck` before committing

## Troubleshooting

### Common Issues

**Build Errors**
- Ensure you're using the correct Android Studio version
- Clean and rebuild the project (Build → Clean Project → Rebuild Project)
- Invalidate caches (File → Invalidate Caches and Restart)

**Dependencies Issues**
- Check your internet connection
- Sync project with Gradle files
- Update dependencies to latest versions

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

**Sudhakar** - [@sudhakar-r08](https://github.com/sudhakar-r08)

Project Link: [https://github.com/sudhakar-r08/AndroidSampleProject](https://github.com/sudhakar-r08/AndroidSampleProject)

## Acknowledgments

- [Android Developers Documentation](https://developer.android.com/)
- [Kotlin Documentation](https://kotlinlang.org/docs/)
- [Material Design Guidelines](https://material.io/design)

---

⭐ **Star this repository if you found it helpful!**
