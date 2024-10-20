# Advanced Learner's Activity

This contains implementation of topics included in CSDF/EH Lab Journal: 

![image](https://github.com/user-attachments/assets/dea126db-dc64-4afb-9d46-dcc2029577b6)


## Project Overview

This repository contains two main activities:

1. **Keylogger**: A Python-based keylogger that captures and logs keystrokes.
2. **Dictionary Attack**: A Java implementation demonstrating a dictionary attack with a wordlist to analyze password strength.

---

## Keylogger (Python)

### Problem Statement
**Objective**: Create a simple keylogger in Python to capture and log keystrokes.

### Key Files
- **KeyLogger.py**: The Python script responsible for logging keystrokes into a file.

### Key Concepts
- **pynput library**: Used to capture keystrokes.
- **Logging duration**: The user can specify how long the keylogger should run.
- **Output**: Keystrokes are saved with timestamps in `key_log.txt`.

### How to Execute (PyCharm)
1. Clone the repository to your local machine using the following command:

    ```bash
    git clone https://github.com/sai-Ga/College-Work.git
    ```

2. Navigate to the directory containing the Python script:

    ```bash
    cd College-Work/CSDF/Advanced\ Learner
    ```

3. Open PyCharm and import the project.
4. Install the required library by running:

    ```bash
    pip install pynput
    ```

5. Run `KeyLogger.py` by clicking the green play button in PyCharm or by running the following command:

    ```bash
    python KeyLogger.py
    ```

6. The program will prompt you to agree to the terms and specify the logging duration. Once finished, the keystrokes will be saved in `key_log.txt`.

### Crucial Code Explanation
- **`log_key` function**: Captures both printable and special keys (like Ctrl, Alt) with a timestamp.
  
  ```python
  def log_key(key):
      timestamp = time.strftime("%Y-%m-%d %H:%M:%S")
      try:
          key_data = f"{timestamp}: {key.char}\n"  # Logs printable characters
      except AttributeError:
          key_data = f"{timestamp}: {str(key)}\n"  # Logs special keys
      with open(log_file, "a") as file:
          file.write(key_data)
  ```

- **User Consent**: Before starting the keylogger, the user must agree to the disclaimer ensuring ethical usage.

---

## Dictionary Attack (Java)

### Problem Statement
**Objective**: Implement a dictionary attack in Java by matching a list of possible passwords against a given wordlist.

### Key Files
- **DictionaryAttack.java**: Java program that performs the dictionary attack.
- **english.0**: Wordlist used for testing possible password combinations.

### How to Execute (Eclipse)
1. Clone the repository using:

    ```bash
    git clone https://github.com/sai-Ga/College-Work.git
    ```

2. Navigate to the relevant directory:

    ```bash
    cd College-Work/CSDF/Advanced\ Learner
    ```

3. Open Eclipse and create a new Java project.
4. Place `DictionaryAttack.java` and `english.0` in the `src` folder of your project.
5. You will need a `passwords.txt` file (not included in the repository) that contains the list of passwords to test against.
6. Run the Java program by right-clicking on `DictionaryAttack.java` and selecting **Run As > Java Application**.

### Crucial Code Explanation
- **File Handling**: The program reads the passwords from `passwords.txt` and attempts to match them against entries in `english.0`.
- **Efficient Processing**: Buffered file reading ensures the program handles large wordlists without performance issues.

---

## Cloning the Repository

You can clone this project to your local machine using the following command:

```bash
git clone https://github.com/sai-Ga/College-Work.git
```

Once cloned, navigate to the `Advanced Learner` folder to access the keylogger and dictionary attack scripts:

```bash
cd College-Work/CSDF/Advanced\ Learner
```

---

## Disclaimer

These tools are for educational purposes only. Please ensure you have permission before using any keylogging or password-cracking software. You are responsible for how these tools are used.
