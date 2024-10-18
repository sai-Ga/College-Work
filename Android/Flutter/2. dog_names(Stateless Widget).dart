import 'package:flutter/material.dart';

void main() {
  runApp(DogNamesListApp());
}

class DogNamesListApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Dog Names List',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: DogNamesList(),
    );
  }
}

class DogNamesList extends StatelessWidget {
  final List<String> dogNames = [
    'Max', 'Charlie', 'Buddy', 'Rocky', 'Daisy',
    'Bailey', 'Lucy', 'Cooper', 'Bella', 'Luna'
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Dog Names List')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: dogNames.map((name) => Text(name, style: TextStyle(fontSize: 20))).toList(),
        ),
      ),
    );
  }
}
