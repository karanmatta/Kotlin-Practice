package com.example.practicekotlin

// Sealed classes are used to define a restricted class hierarchy
// A sealed class can have subclasses, but all of them must be declared in the same file as the sealed class itself
// Sealed classes are abstract by themselves, they cannot be instantiated directly and can have abstract members
// Sealed classes are not allowed to have non-private constructors (their constructors are private by default)
// Sealed classes are allowed to have subclasses, but all of them must be declared in the same file as the sealed class itself
// Sealed classes are allowed to have abstract members
// Sealed classes are not allowed to have non-private constructors (their constructors are private by default)
// Sealed classes cannot be instantiated directly

sealed class Failure {
    class Error(val exception: Exception) : Failure()
    class NotFound(val message: String) : Failure()
}