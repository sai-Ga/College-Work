Here are the six separate Flutter code files, each with its own `main` function:

### 1. Text Widget Demo (text_widget_demo.dart)
```dart
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
```

### 2. Dog Names List (dog_names_list.dart)
```dart
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
```

### 3. City Name Display (city_name_display.dart)
```dart
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
```

### 4. Background Color Changer (background_color_changer.dart)
```dart
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
```

### 5. Navigation Demo (navigation_demo.dart)
```dart
import 'package:flutter/material.dart';

void main() {
  runApp(NavigationDemoApp());
}

class NavigationDemoApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Navigation Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: NavigationDemoFirstScreen(),
    );
  }
}

class NavigationDemoFirstScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('First Screen')),
      body: Center(
        child: ElevatedButton(
          child: Text('Go to Second Screen'),
          onPressed: () {
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => NavigationDemoSecondScreen()),
            );
          },
        ),
      ),
    );
  }
}

class NavigationDemoSecondScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Second Screen')),
      body: Center(
        child: ElevatedButton(
          child: Text('Go Back'),
          onPressed: () {
            Navigator.pop(context);
          },
        ),
      ),
    );
  }
}
```

### 6. Login Form (login_form.dart)
```dart
import 'package:flutter/material.dart';

void main() {
  runApp(LoginFormApp());
}

class LoginFormApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Login Form',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: LoginForm(),
    );
  }
}

class LoginForm extends StatefulWidget {
  @override
  _LoginFormState createState() => _LoginFormState();
}

class _LoginFormState extends State<LoginForm> {
  final _formKey = GlobalKey<FormState>();
  String _email = '';
  String _password = '';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Login Form')),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: Column(
            children: <Widget>[
              TextFormField(
                decoration: InputDecoration(labelText: 'Email'),
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Please enter your email';
                  }
                  return null;
                },
                onSaved: (value) {
                  _email = value!;
                },
              ),
              TextFormField(
                decoration: InputDecoration(labelText: 'Password'),
                obscureText: true,
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Please enter your password';
                  }
                  return null;
                },
                onSaved: (value) {
                  _password = value!;
                },
              ),
              SizedBox(height: 20),
              ElevatedButton(
                child: Text('Login'),
                onPressed: () {
                  if (_formKey.currentState!.validate()) {
                    _formKey.currentState!.save();
                    ScaffoldMessenger.of(context).showSnackBar(
                      SnackBar(content: Text('Processing Data')),
                    );
                  }
                },
              ),
            ],
          ),
        ),
      ),
    );
  }
}
```

Each of these files can now be run separately with their own `main` functions.
