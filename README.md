# Final_Exam

This project demonstrates the use of multithreading in Java through four classes. It includes examples of using the `Thread` class, implementing the `Runnable` interface, and managing shared resources with synchronization.

---

## Classes

### 1. `MyTask1`
- **Description:** 
  A class that extends the `Thread` class to execute tasks. It demonstrates how to override the `run()` method to implement custom behavior for threads.

---

### 2. `MyTask2`
- **Description:** 
  A class that implements the `Runnable` interface. It is used to create threads by passing an instance of this class to the `Thread` constructor.

---

### 3. `MyTask3`
- **Description:** 
  A class that represents a shared resource. It uses synchronized methods to safely increment and retrieve a count variable in a multithreaded environment, ensuring thread safety.

---

### 4. `MyTask4`
- **Description:** 
  The main class of the project. It demonstrates the usage of the other classes by creating and starting threads, as well as managing shared resources.

---

## How to Run the Project

1. **the JAR file:**
   - Go to the `dist` folder and download which `Task*.jar` you want.

2. **Run the JAR file:**
   - Open the command prompt (`cmd`).
   - Navigate to the directory containing the `.jar` file. For example:
     ```bash
     cd path\to\dist
     ```

   - Run the JAR file using the following command:
     ```bash
     java -jar Task*.jar
     ```

   - The program will execute, and the output will appear in the terminal.

---

## Author
- **Name:** Sultan Ali Alhasani  
- **ID:** 444004481
