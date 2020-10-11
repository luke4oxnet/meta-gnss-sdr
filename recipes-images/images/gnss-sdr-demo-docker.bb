require core-image-docker-container.bb
require base-gnss-sdr-dev-image.bb

SUMMARY = "An image that builds a Docker image file containing GNSS-SDR."
DESCRIPTION = "An image that builds a Docker image file containing GNSS-SDR for testing purposes."
LICENSE = "MIT"
PR = "r1"

EXTRA_IMAGE_FEATURES += "tools-debug tools-profile tools-sdk dev-pkgs"

RDEPENDS_packagegroup-sdr-base-python += " python3-six"

SDK_EXTRA_TOOLS += "nativesdk-python3-six"

IMAGE_INSTALL += " \
    packagegroup-gnss-sdr-base \
    packagegroup-gnss-sdr-drivers \
    packagegroup-gnss-sdr-bin \
"

# set a meaningful name and tag for the docker output image
DOCKER_IMAGE_TAG = "latest"
DOCKER_IMAGE_NAME_EXPORT = "gnsssdr-demo-arm32v7:${DOCKER_IMAGE_TAG}"
