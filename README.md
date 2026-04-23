# WhatsApp Chatbot Backend Simulation

This project is a simple backend simulation of a WhatsApp chatbot using Java and Spring Boot.

## Features

* POST `/webhook` endpoint
* Accepts JSON input simulating messages
* Responds with predefined replies:

  * Hi / Hii / HIII → Hello
  * Bye → Goodbye
* Logs all incoming messages
* Input validation using `@Valid` and `@NotBlank`

## Tech Stack

* Java
* Spring Boot
* Maven

## API Example

### Request

POST /webhook

```json
{
  "message": "Hi"
}
```

### Response

```json
{
  "reply": "Hello"
}
```

## How to Run

1. Clone the repository
2. Run the Spring Boot application
3. Test using Postman:
   http://localhost:8080/webhook
