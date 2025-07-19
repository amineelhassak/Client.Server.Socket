# Java Client-Server Harmonic Sum Example

This project demonstrates a simple client-server application in Java using sockets. The client sends an integer to the server, and the server responds with the harmonic sum of that integer.

## Project Structure

```
Client.Server.Socket/
└── clientServerExams/
    ├── ClientSocket.java
    ├── ServerSocket.java
    └── Harmonique.java
```

- **ClientSocket.java**: The client application. Connects to the server, sends an integer, and receives the harmonic sum.
- **ServerSocket.java**: The server application. Waits for a client, receives an integer, computes the harmonic sum, and sends the result back.
- **Harmonique.java**: Contains the logic for calculating the harmonic sum.

## How It Works

1. **Start the server**: The server listens on port 8080 for incoming client connections.
2. **Start the client**: The client connects to the server, sends an integer (e.g., 5), and prints the harmonic sum received from the server.

## Compilation

Open a terminal in the project root and run:

```
javac clientServerExams/*.java
```

## Running the Server

In one terminal, start the server:

```
java -cp . clientServerExams.ServerSocket
```

## Running the Client

In another terminal, start the client:

```
java -cp . clientServerExams.ClientSocket
```

## Example Output

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

## Notes
- Ensure the server is running before starting the client.
- You can modify the integer sent by the client in `ClientSocket.java`.
- The harmonic sum for `n` is: 1 + 1/2 + 1/3 + ... + 1/n. 