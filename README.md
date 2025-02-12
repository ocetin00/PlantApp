<!-- README.md -->

<h1 align="center">Plant - Android App</h1>
<p align="center"> <strong>Plant App</strong> built with XML, MVVM, Layered Modular Architecture, Jetpack Libraries(viewmodel,navigation,dataStore) and Hilt.</p>

## Some images on diffrent size emulators ✅ 
![img1](https://github.com/ocetin00/temp/blob/main/Screenshot%202025-02-10%20at%2003.37.26.png)


## Features ✅ 

 <strong>Onboarding</strong><br>
 <strong>Paywall Screen</strong><br>
 <strong>Home Screen</strong><br>

---


## 🛠️ Tech Stack & Libraries

<table>
  <tr>
    <th>Feature</th>
    <th>Library</th>
  </tr>
  <tr>
    <td>UI Framework</td>
    <td>XML</a></td>
  </tr>
  <tr>
    <td>Dependency Injection</td>
    <td><a href="https://dagger.dev/hilt/">Hilt</a></td>
  </tr>
  <tr>
    <td>Local Storage</td>
    <td>Data Store</td>
  </tr>
  <tr>
    <td>Networking</td>
    <td><a href="https://square.github.io/retrofit/">Retrofit</a> + <a href="https://square.github.io/okhttp/">OkHttp</a></td>
  </tr>
  <tr>
    <td>Asynchronous</td>
    <td><a href="https://developer.android.com/kotlin/coroutines">Coroutines</a> + <a href="https://developer.android.com/kotlin/flow">Flow</a></td>
  </tr>
  <tr>
    <td>Image Loading</td>
    <td><a href="https://coil-kt.github.io/coil/">Coil</a></td>
  </tr>
  <tr>
    <td>Api response parsing</td>
    <td><a href="https://github.com/skydoves/sandwich">sandwich</a></td>
  </tr>
</table>

---

## 🏗️ Project Architecture

The project follows **MVVM (Model-View-ViewModel) architecture** with **View Binding**:

![module](https://github.com/ocetin00/temp/blob/main/Screenshot%202025-02-10%20at%2003.25.06.png)


## ⚙️ Setup & Installation

Clone this repository:
```bash
git clone https://github.com/ocetin00/PlantApp.git
cd PlantApp
```

### 🏗 Prerequisites
- **Android Studio LadyBug or newer**
- **Minimum SDK 28 (Android 9.0)**
- **Gradle version: 8.10.2, AGP 8.8.0**

### 🔧 Running the Project

2️⃣ **Build & Run**
```bash
./gradlew clean build
```
or directly run from **Android Studio**.  

---

##  Things I Planned But Couldn't Implement Because Of Time

- **UI/Unit Test** 
- **Featured and Layered based architecture(For now just Layered)**
- **Blur effect same places**
- **Text gradient for some TextView**
- **More encapsulation with visibility modifier**
- **Offline cache api response**
- **Extracting common dimension and other res values**

