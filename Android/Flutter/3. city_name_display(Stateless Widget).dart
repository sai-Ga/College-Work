import 'package:flutter/material.dart';

void main() {
  runApp(CityNameDisplayApp());
}

class CityNameDisplayApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'City Name Display',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: CityNameDisplay(),
    );
  }
}

class CityNameDisplay extends StatefulWidget {
  @override
  _CityNameDisplayState createState() => _CityNameDisplayState();
}

class _CityNameDisplayState extends State<CityNameDisplay> {
  String cityName = '';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('City Name Display')),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            TextField(
              onChanged: (value) {
                setState(() {
                  cityName = value;
                });
              },
              decoration: InputDecoration(
                labelText: 'Enter a city name',
                border: OutlineInputBorder(),
              ),
            ),
            SizedBox(height: 20),
            Text(
              'Entered City: $cityName',
              style: TextStyle(fontSize: 24),
            ),
          ],
        ),
      ),
    );
  }
}
