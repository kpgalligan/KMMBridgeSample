// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://api.github.com/repos/kpgalligan/KMMBridgeSample/releases/assets/79939035.zip"
let remoteKotlinChecksum = "d92f27657e1fb3851e86dde0c6e7e98362701efe66a2d2be7a7db23029c496fa"
let packageName = "allshared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)