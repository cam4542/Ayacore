#!/bin/bash
cd ~/src
rm -rf bin
mkdir -p bin
echo "Compiling Java files..."
javac -d bin $(find src -name "*.java")
if [ $? -eq 0 ]; then
    echo "Build successful."
    echo "Running AyaCore..."
    java -cp bin com.omara.jem.kaori.AyaCore
else
    echo "Build failed. Check errors above."
fi
