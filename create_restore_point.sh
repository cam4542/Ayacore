#!/bin/bash

# Create a timestamped zip archive of the project
timestamp=$(date +"%Y-%m-%d_%H-%M-%S")
zip -r "restore_point_$timestamp.zip" src/ Save_Point.txt

echo "Restore point created: restore_point_$timestamp.zip"
