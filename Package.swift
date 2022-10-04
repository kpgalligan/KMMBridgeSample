// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://api.github.com/repos/kpgalligan/FaktoryLibKotlin/releases/assets/79832206.zip"
let remoteKotlinChecksum = "76d19b9ea23a896b1ac9ff6587c5a67684db3a32ecd108a335d5f86d080c9752"
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