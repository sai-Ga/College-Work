import 'package:flutter/material.dart';

void main() {
  runApp(TextWidgetDemoApp());
}

class TextWidgetDemoApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Text Widget Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: TextWidgetDemo(),
    );
  }
}

class TextWidgetDemo extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Text Widget Demo')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'Simple Text',
              style: TextStyle(fontSize: 24),
            ),
            Text(
              'Colored Text',
              style: TextStyle(fontSize: 24, color: Colors.blue),
            ),
            Text(
              'Bold Text',
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            Text(
              'Italic Text',
              style: TextStyle(fontSize: 24, fontStyle: FontStyle.italic),
            ),
            Text(
              'Long text that demonstrates how to handle overflow by using ellipsis when the text is too long to fit on a single line.',
              style: TextStyle(fontSize: 18),
              overflow: TextOverflow.ellipsis,
              maxLines: 2,
            ),
          ],
        ),
      ),
    );
  }
}
