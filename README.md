🚀 TaskPilot – Scheduler Dashboard

TaskPilot is a full-stack project built with Spring Boot and React to demonstrate Spring Boot Scheduling and how background jobs can be monitored using a web dashboard.

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

🛠 Tech Stack

Backend: Java, Spring Boot, Spring Scheduling, Spring Data JPA, REST
Frontend: React, Material UI (MUI), Recharts, React Router
Database: MySQL / H2

▶️ Run the Project

Backend:

cd backend
mvn spring-boot:run


Frontend:

cd frontend
npm install
npm start
