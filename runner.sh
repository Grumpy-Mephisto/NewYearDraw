#!/bin/bash

# Define colors
RED='\033[0;31m'
GREEN='\033[0;32m'
NC='\033[0m' # No Color

# Check if java is installed
if ! command -v java &> /dev/null; then
    echo -e "${RED}Error: Java is not installed.${NC}" >&2
    exit 1
fi

# Check if Main.java exists
if [ ! -f "Main.java" ]; then
    echo -e "${RED}Error: Main.java not found.${NC}" >&2
    exit 1
fi

# Compile Java files
if ! javac *.java; then
    echo -e "${RED}Compilation failed.${NC}" >&2
    exit 1
fi

# Run Main class
java Main

# Check the exit status and display success/failure message
if [ $? -eq 0 ]; then
    echo -e "${GREEN}Success${NC}"
else
    echo -e "${RED}Failed${NC}"
fi

# Remove all generated .class files recursively
find . -name '*.class' -exec rm -f {} +
