🚀 TaskPilot – Scheduler Dashboard

TaskPilot is a full-stack project built with Spring Boot and React to demonstrate Spring Boot Scheduling and how background jobs can be monitored using a web dashboard.

It shows how real applications run background tasks (cron jobs) and how we can track, monitor, and visualize their execution.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📸 Screenshots

[ Job Log Page ] <img width="953" height="494" alt="image" src="https://github.com/user-attachments/assets/1c2106f1-ea6e-4182-a020-787755c8b4c4" />

[ Job Stats Page ] <img width="952" height="482" alt="image" src="https://github.com/user-attachments/assets/36900fb5-ef4a-41aa-8a2c-a0a300cbcaad" /> 

🧭 Dashboard Layout

📋 Logs Page (Pagination + Filters)

📊 Stats Page (Bar & Pie Charts)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🧠 What this project shows

⏰ Uses Spring Boot @Scheduled for background jobs (fixedRate, fixedDelay, cron)

✅ Logs each job execution with SUCCESS / FAILED status in database

⚙️ Supports dynamic cron from application.properties

🌐 Provides REST APIs to:

View logs with pagination & filtering

View job statistics (success, failed, last run time)

🎨 React dashboard with:

Logs table + pagination + filters

Stats page with Bar & Pie charts

Admin layout using Material UI (MUI)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🛠 Tech Stack

Backend:

Java

Spring Boot

Spring Scheduling

Spring Data JPA

REST APIs

Frontend:

React.js

Material UI (MUI)

Recharts

React Router

Database:

MySQL





