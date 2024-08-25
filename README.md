# registration-app

# Registration App

## Overview

This project is a simple registration and login application. It requires MySQL as a database to store user information.

## Prerequisites

- **MySQL:** Ensure MySQL is installed and running on your machine.

## Setup Instructions

### 1. Create the Database

1. Open your MySQL command line client or a MySQL GUI tool like phpMyAdmin.
2. Run the following command to create the database:

    ```sql
    CREATE DATABASE logindb;
    ```

### 2. Create the Tables

Once the database is created, you need to set up the tables. Use the following SQL commands:

#### Create `login` Table

This table will store user login information.

```sql
USE logindb;

CREATE TABLE login (
    email VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);
```

### Key Updates
- Added instructions for creating the `registration` table with the required columns: `name`, `city`, `email`, and `mobile`.
This table also store registration table
``` sql
USE logindb;

CREATE TABLE registration (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    mobile VARCHAR(15) NOT NULL
);
```

### Key Points

1. **Prerequisites:** Ensures MySQL is installed.
2. **Setup Instructions:** Details steps to create the database and tables.
3. **Configuration:** Notes to configure the application to connect to the database.
4. **Running the Application:** Basic instructions to deploy and use the app.
5. **Contributing:** Invitation to contribute to the project.
6. **License:** Mentions the project license (adjust as needed).

Feel free to adjust or expand the sections as needed for your specific project!
