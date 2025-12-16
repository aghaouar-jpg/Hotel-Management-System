# =========================
# Task 9 – Secure Dockerfile
# =========================

FROM eclipse-temurin:17-jre-jammy

# Create non-root user (security best practice)
RUN useradd -m appuser

WORKDIR /app

# Copy the built jar only
COPY target/hotel-management-system-1.0.jar app.jar

# Fix permissions
RUN chown -R appuser:appuser /app

# Switch to non-root user
USER appuser

# Run application
ENTRYPOINT ["java","-jar","app.jar"]
