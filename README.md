## Example project to show @ConditionalOnProperty with @PropertySource behaviour

When @ConditionalOnProperty is combined with @PropertySource, the former can only read properties loaded by the latter when it is used on the bean, not on the config class itself. Please see ConditionalBeansConfig.java for example.
