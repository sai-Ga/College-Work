import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'post.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter JSON Serialization Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: PostsPage(),
    );
  }
}

class PostsPage extends StatefulWidget {
  @override
  _PostsPageState createState() => _PostsPageState();
}

class _PostsPageState extends State<PostsPage> {
  List<Post> _posts = [];

  // Fetch data from API and deserialize JSON into Post objects
  Future<void> fetchPosts() async {
    final response = await http.get(Uri.parse('https://jsonplaceholder.typicode.com/posts'));

    if (response.statusCode == 200) {
      List<dynamic> jsonResponse = json.decode(response.body);
      setState(() {
        _posts = jsonResponse.map((post) => Post.fromJson(post)).toList();
      });
    } else {
      throw Exception('Failed to load posts');
    }
  }

  // Example method to serialize Dart objects back to JSON
  void printSerializedJson() {
    if (_posts.isNotEmpty) {
      // Serializing the first Post object back to JSON
      Map<String, dynamic> serializedJson = _posts[0].toJson();
      print("Serialized JSON of the first post: ${json.encode(serializedJson)}");
    }
  }

  @override
  void initState() {
    super.initState();
    fetchPosts();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Posts'),
        actions: [
          IconButton(
            icon: Icon(Icons.print),
            onPressed: printSerializedJson,
          ),
        ],
      ),
      body: _posts.isEmpty
          ? Center(child: CircularProgressIndicator())
          : ListView.builder(
        itemCount: _posts.length,
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(_posts[index].title),
            subtitle: Text(_posts[index].body),
          );
        },
      ),
    );
  }
}
