# Marcadores Backend
This project was generated with spring boot 3.3.1 and java 17

# Pre - requisites
Before run the local configuration, the `.env` file must be configured for the appliaction environment variables:
```
PORT=[port-app]
DATABASE_URL=[url-connection-database-jdbc]
DATABASE_PORT=[port-connection-database]
DATABASE_USERNAME=[username-database]
DATABASE_PASSWORD=[password-database]
```

Note: The brackets must be removed and the corresponding values inserted.

### Installation and project execution

<div style="padding: 0px 20px;">
<details>
<summary><b>Download the project</b></summary>

<div style="padding: 20px 40px;">

The first thing to take into account is to have downloaded the project, in this case there are several ways.
> Using git with CLI


**On Linux/MacOS/Windows:**
```
git clone https://github.com/jeirf12/MarcadorMapaBackend
```

> Using the Github website

In this case you go to the **[project's](https://github.com/jeirf12/MarcadorMapaBackend)** page
and in the upper right section.

![Code](https://github.com/GestorSolicitudesApp/architecture/blob/main/Imagenes/Codigo.png)

Select the Download ZIP button.

![Download](https://github.com/GestorSolicitudesApp/architecture/blob/main/Imagenes/Descarga.png)

</div>

</details>
<details>
<summary><b>On-site installation of the project</b></summary>

<div style="padding: 20px 40px;">

For the installation we have several ways.
> Using CLI

First we go to the root of the project and access the `MarcadorMapaBackend` path.

**On Linux/MacOS/Windows:**
```
cd MarcadorMapaBackend
```

Then we execute the following maven command, where the wrapper to run the project is installed
with the maven command that comes with the project by default.

**On Linux/MacOS/Windows:**
```
mvn wrapper:wrapper
```

Note: Sometimes, this step is not necessary when you have the `.mvn` folder inside the repository.

> Using Intellig

In this case, just open the editor with the project and look for the execute project button.
</div>

</details>
<details>
<summary><b>Execution of the project on site</b></summary>

<div style="padding: 20px 40px;">

**IMPORTANT:** In the execution of the project if it is with Intelligent, this part is not necessary.

> CLI execution

In the execution of the project with CLI, we have the following steps to prevent unwanted changes in the application.

1. First we must verify in the `MarcadorMapaBackend` path if we have the `target` folder. Then we proceed to delete it with the following command:

<div style="padding: 0px 30px">

**On Linux/MacOS:**
```
rm -rf target
```

**On Windows:**
```
rd /s/q target
```
</div>

2. Then we execute the command, where it will start compiling and installing dependencies needed for the project:

<div style="padding: 0px 30px">

**On Linux/MacOS/Windows:**
```
mvnw spring-boot:run
```
</div>

</div>
</details>
</div>
