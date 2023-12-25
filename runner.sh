#!/bin/bash

# Define colors
RED='\033[0;31m'
GREEN='\033[0;32m'
NC='\033[0m' # No Color

# Check if java is installed
if ! command -v java &> /dev/null; then
    echo "${RED}Error: Java is not installed.${NC}" >&2
    exit 1
fi

# Check if Main.java exists
if [ ! -f "Main.java" ]; then
    echo "${RED}Error: Main.java not found.${NC}" >&2
    exit 1
fi

# Compile Java files
if ! javac *.java; then
    echo "${RED}Compilation failed.${NC}" >&2
    exit 1
fi

# Run Main class
java Main

# Remove all generated .class files recursively
find . -name '*.class' -exec rm -f {} +
