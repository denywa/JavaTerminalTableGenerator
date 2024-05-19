# TableGenerator Usage Guide

## Overview
The `TableGenerator` class is designed to print a formatted table of any array of objects in Java, where each object's fields represent the columns of the table. This utility is particularly useful for quickly visualizing data in a tabular format directly from your Java applications.

## Requirements
- Java Reflection API is used, so ensure your objects' fields are accessible or declared public.
- All objects in the array should be instances of the same class.

## How to Use

1. **Prepare Your Data Objects:**
   Ensure that your data objects (e.g., instances of a class `MataKuliah` or `Mahasiswa`) are properly instantiated and populated.

2. **Call the `printTable` Method:**
   Pass an array of your data objects to the `printTable` method of the `TableGenerator` class. For example:
   ```java
   MataKuliah[] mataKuliahList = {new MataKuliah("Pemrograman", "Senin", "08:00", 2), new MataKuliah("Basis Data", "Selasa", "10:00", 3)};
   TableGenerator.printTable(mataKuliahList);
   ```

3. **View the Output:**
   The table will be printed to the standard output, formatted with headers representing the field names and rows representing the objects' field values.

