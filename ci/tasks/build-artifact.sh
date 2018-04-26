#!/bin/bash

set -e -x


pushd git-repo/web-store
  ./mvnw clean package
popd

cp git-repo/web-store/target/concourse-app-0.0.1-SNAPSHOT.jar   build-output/.
