package com.hanuszczak.translatorappkmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

class IOSMutableStateFLow<T>(
    initialValue: T
): CommonMutableStateFlow<T>(MutableStateFlow(initialValue))