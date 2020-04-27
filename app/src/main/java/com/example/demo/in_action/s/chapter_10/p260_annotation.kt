package com.example.demo.in_action.s.chapter_10

import kotlin.reflect.KClass

interface ValueSerializer<T> {
    fun toJsonValue(value: T): Any?
    fun fromJsonValue(jsonValue: Any?): T
}

interface KCallable<out R> {
    fun call(vararg arg: Any?): R
}

@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class BindingAnnotation

@BindingAnnotation
annotation class MyBinding

annotation class JsonExclude

annotation class JsonName(val name: String)

annotation class DeserializeInterface(val targetClass: KClass<out Any>)

annotation class CustomSerializer(val serializerClass: KClass<out ValueSerializer<*>>)