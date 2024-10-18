import 'dart:math';
import 'package:flutter/material.dart';

void main() {
  runApp(BackgroundColorChangerApp());
}

class BackgroundColorChangerApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Background Color Changer',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: BackgroundColorChanger(),
    );
  }
}

class BackgroundColorChanger extends StatefulWidget {
  @override
  _BackgroundColorChangerState createState() => _BackgroundColorChangerState();
}

class _BackgroundColorChangerState extends State<BackgroundColorChanger> {
  Color backgroundColor = Colors.white;

  void changeColor() {
    setState(() {
      backgroundColor = Color((Random().nextDouble() * 0xFFFFFF).toInt()).withOpacity(1.0);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Background Color Changer')),
      body: Container(
        color: backgroundColor,
        child: Center(
          child: ElevatedButton(
            child: Text('Change Color'),
            onPressed: changeColor,
          ),
        ),
      ),
    );
  }
}
