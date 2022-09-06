#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_rowielokentmatsui_writeme_WritingBoard_stringFromJNI(JNIEnv *env,
                                                                      jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, returnValue);
}