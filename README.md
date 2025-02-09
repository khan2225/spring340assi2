Joke API

The Joke API lets you get random jokes or jokes according to a type. 

The response from the API is a single JSON object that looks like this:

/* {
     "id": 166,
     "type": "general",
    "setup": "What did the beaver say to the tree?",
     "punchline": "It's been nice gnawing you."
 }


{
    "id": 98,
    "type": "general",
    "setup": "Did you hear the joke about the wandering nun?",
    "punchline": "She was a roman catholic."
}

{
    "id": 340,
    "type": "general",
    "setup": "Why do bananas have to put on sunscreen before they go to the beach?",
    "punchline": "Because they might peel!"
}

{
    "id": 347,
    "type": "general",
    "setup": "Why do ducks make great detectives?",
    "punchline": "They always quack the case."
}
*/

On POSTMAN:
http://localhost:8080/joke/joke (GET)
