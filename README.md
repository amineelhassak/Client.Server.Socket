# 🔗 Java Client-Server Harmonic Sum Example

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Sockets](https://img.shields.io/badge/Sockets-Networking-blue?style=for-the-badge)]()
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Complete-brightgreen.svg)]()
[![Version](https://img.shields.io/badge/Version-1.0.0-blue.svg)]()

<div align="center">

# 🔗 Java Client-Server Harmonic Sum

> A simple Java client-server application using sockets. The client sends an integer, the server responds with the harmonic sum.

**Learn Java networking and socket programming with this interactive example!**

[![GitHub stars](https://img.shields.io/github/stars/yourusername/Client.Server.Socket?style=social)](https://github.com/yourusername/Client.Server.Socket/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/yourusername/Client.Server.Socket?style=social)](https://github.com/yourusername/Client.Server.Socket/network)
[![GitHub issues](https://img.shields.io/github/issues/yourusername/Client.Server.Socket)](https://github.com/yourusername/Client.Server.Socket/issues)

</div>

---

## 📚 Table of Contents
- [🎯 Overview](#-overview)
- [✨ Features](#-features)
- [🛠️ Project Structure](#️-project-structure)
- [🚀 How It Works](#-how-it-works)
- [⚙️ Compilation & Running](#-compilation--running)
- [🧪 Example Output](#-example-output)
- [🛠️ Technologies Used](#️-technologies-used)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)

## 🎯 Overview
This project demonstrates a simple client-server application in Java using sockets. The client sends an integer to the server, and the server responds with the harmonic sum of that integer.

## ✨ Features
- ✅ Simple Java socket programming
- ✅ Client sends an integer, server computes harmonic sum
- ✅ Clean separation of client, server, and logic
- ✅ Easy to compile and run
- ✅ Educational for networking beginners

## 🛠️ Project Structure
```
Client.Server.Socket/
└── clientServer/
    ├── ClientSocket.java   # Client application
    ├── ServerSocket.java   # Server application
    └── Harmonique.java     # Harmonic sum logic
```

## 🚀 How It Works
1. **Start the server**: The server listens on port 8080 for incoming client connections.
2. **Start the client**: The client connects to the server, sends an integer (e.g., 5), and prints the harmonic sum received from the server.

## ⚙️ Compilation & Running
### Compilation
Open a terminal in the project root and run:
```bash
javac clientServer/*.java
```

### Running the Server
In one terminal, start the server:
```bash
java -cp . clientServer.ServerSocket
```

### Running the Client
In another terminal, start the client:
```bash
java -cp . clientServer.ClientSocket
```

## 🧪 Example Output
**Server:**
```
Server listening on port 8080
Client connected.
```

**Client:**
```
Connecting success
result: 2.283333333333333
```

## 🛠️ Technologies Used
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
- ![Sockets](https://img.shields.io/badge/Sockets-Networking-blue?style=for-the-badge)

## 🤝 Contributing
Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

### How to Contribute
1. **Fork the repository**
   ```bash
   git clone https://github.com/yourusername/Client.Server.Socket.git
   ```
2. **Create your feature branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Make your changes**
   - Follow the existing code style
   - Add new features or fix bugs
   - Update documentation as needed
4. **Commit your changes**
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
5. **Push to the branch**
   ```bash
   git push origin feature/AmazingFeature
   ```
6. **Open a Pull Request**

### Contribution Guidelines
- Follow the existing code style and conventions
- Add documentation for new features
- Ensure the app compiles and runs without errors

## 📄 License
This project is part of the 42 School curriculum. The code is written for educational purposes.

---

<div align="center">

**Made with ❤️ and lots of ☕**

*Learn Java networking and socket programming with this interactive example!*

[![GitHub stars](https://img.shields.io/github/stars/yourusername/Client.Server.Socket?style=social)](https://github.com/yourusername/Client.Server.Socket/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/yourusername/Client.Server.Socket?style=social)](https://github.com/yourusername/Client.Server.Socket/network)
[![GitHub issues](https://img.shields.io/github/issues/yourusername/Client.Server.Socket)](https://github.com/yourusername/Client.Server.Socket/issues)

**Author**: [Your Name]  
**School**: 42 School  
**Project**: Java Client-Server Harmonic Sum  
**Last updated**: December 2024

</div>
