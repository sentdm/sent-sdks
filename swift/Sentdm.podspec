Pod::Spec.new do |s|
  s.name = 'Sentdm'
  s.swift_version = '5.0'
  s.ios.deployment_target = '13.0'
  s.osx.deployment_target = '13.0'
  s.tvos.deployment_target = '9.0'
  s.watchos.deployment_target = '4.0'
  s.version = '1.0.0'
  s.source = { :git => 'https://github.com/sentdm/sent-sdks.git', :tag => 'v1.0.0' }
  s.authors = 'sent.dm'
  s.license = { :type => 'MIT', :file => 'LICENSE' }
  s.homepage = 'https://github.com/sentdm/sent-sdks/tree/main/swift'
  s.summary = 'Sentdm Swift SDK'
  s.source_files = 'Sentdm/**/*.swift'
  s.dependency 'AnyCodable-Konfig', '~> 0.6.9'
end
