#!/bin/bash

sed -i '1s/^/package com.peerisland.parser.generated;\n\n/' ./src/main/java/com/peerisland/parser/generated/Calculator*.java
