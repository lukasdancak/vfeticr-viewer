# VFeTiCr Viewer

## About web app
This web application enables systematic exploration of quaternary alloys in the V-Fe-Ti-Cr system by using a database that contains all compositionally possible alloys with integer atomic percentages for each constituent element. Users can screen and filter candidate compositions according to scientifically relevant descriptors, including valence electron concentration (VEC), lattice parameter, and estimated raw-material cost for alloy preparation.

## Local Setup

### Spring profile
To run the app locally, set the Spring profile to `dev`:

```bash
SPRING_PROFILES_ACTIVE=dev
```

### Default database connection settings
Default database connection settings are configured in `src/main/resources/application.properties`:
- Database URL: `jdbc:postgresql://localhost:5432/vfeticr_viewer`
- Username: `postgres`
- Password: `mysecretpassword`

These default values can be overridden by setting environment variables: `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD`.

### Running local PostgreSQL DB with Docker
You can use the provided `compose.local-db.yaml` file to start a local PostgreSQL container with the same credentials as the default configuration:

```bash
docker-compose -f compose.local-db.yaml up
```

This will create and start a PostgreSQL container named `vfeticr_viewer_db` with the database `vfeticr_viewer`.
