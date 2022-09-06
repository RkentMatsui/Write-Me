#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_example_rowielokentmatsui_writeme_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_rowielokentmatsui_writeme_HardDraw_stringFromJNI(JNIEnv *env, jobject instance) {

    // TODO
    std::string returnValue = "Hello from C++";

    return env->NewStringUTF(returnValue.c_str());
}extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_rowielokentmatsui_writeme_WritingBoardAvg_stringFromJNI(JNIEnv *env,
                                                                         jobject instance) {

    std::string returnValue = "Hello from C++";

    return env->NewStringUTF(returnValue.c_str());
}extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_rowielokentmatsui_writeme_Practice_1write_stringFromJNI(JNIEnv *env,
                                                                         jobject instance) {

    // TODO


    return env->NewStringUTF("");
}