/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */

/**
 * @author Andres Almiray
 */

includeTargets << griffonScript('_GriffonCreateArtifacts')

argsMap = argsMap ?: [:]
argsMap.skipPackagePrompt = true

if(!new File('${basedir}/griffon-app/conf/FlywayConfig.groovy').exists()) {
    createArtifact(
        name:   'FlywayConfig',
        suffix: '',
        type:   'FlywayConfig',
        path:   'griffon-app/conf')
}

ant.mkdir(dir: "${basedir}/griffon-app/resources/flyway/migrations")
ant.mkdir(dir: "${basedir}/src/flyway/migrations")