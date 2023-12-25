#!/bin/bash

# Define colors
RED='\033[0;31m'
GREEN='\033[0;32m'
NC='\033[0m' # No Color

check_java() {
    # Check if Java is installed
    if ! command -v java &> /dev/null; then
        echo "${RED}Error: Java is not installed.${NC}" >&2
        exit 1
    fi
}

check_main_file() {
    # Check if Main.java exists
    if [ ! -f "Main.java" ]; then
        echo "${RED}Error: Main.java not found.${NC}" >&2
        exit 1
    fi
}

compile_java_files() {
    # Compile Java files
    if ! javac *.java; then
        echo "${RED}Compilation failed.${NC}" >&2
        exit 1
    fi
}

run_main_class() {
    # Run Main class
    java Main
}

cleanup() {
    # Remove all generated .class files recursively
    find . -name '*.class' -exec rm -f {} +
}

# Execution sequence
check_java
check_main_file
compile_java_files
run_main_class
cleanup
