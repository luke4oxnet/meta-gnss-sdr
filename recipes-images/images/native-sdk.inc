SDK_EXTRA_TOOLS = " \
    nativesdk-python3-netserver nativesdk-python3-pprint \
    nativesdk-python3-pickle nativesdk-python3-shell \
    nativesdk-python3-modules \
    nativesdk-orc nativesdk-swig nativesdk-python3-distutils \
    nativesdk-python3-xml nativesdk-python3-compile \
    nativesdk-cmake nativesdk-python3-mako \
    nativesdk-protobuf nativesdk-protobuf-compiler \
    nativesdk-make nativesdk-ninja nativesdk-g++ nativesdk-gcc \
"

SDK_EXTRA_TOOLS:task-populate-sdk-ext = ""

TOOLCHAIN_HOST_TASK:append = "${SDK_EXTRA_TOOLS}"
