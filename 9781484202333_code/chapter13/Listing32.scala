trait ServiceProviderInterface {
def service(message: String)
}
final class ServiceProviderImplementation {
def service(type: String, property: String) { /* ... */ }
}
implicit class Adapter(impl: ServiceProviderImplementation) extends ServiceProviderInterface
{
def service(property: String) { impl.service(TYPEA, property) }
}
val service: ServiceProviderInterface = new ServiceProviderImplementation ()