plugins {
    id("au.id.tmm.toyrobotjava2021.java-application-conventions")
}

dependencies {
}

application {
    mainClass.set("au.id.tmm.toyrobotjava2021.app.Main")
}

tasks.getByName<JavaExec>("run") {
    standardInput = System.`in`
}
