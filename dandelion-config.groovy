// id : unique ID for this environment
// dbname : alias for this environment
// prefix: internal prefix for this environment
// jdbc:${env.jdbcType}://${env.host}:${port}/${env.dbname}

configLoaded='true'

indexers = [
            'server.index.indexer.DefaultIndexer',
            'server.index.indexer.BooleanXPathIndexer',
            'server.index.indexer.DateXPathIndexer',
            'server.index.indexer.IntegerXPathIndexer',
            'server.index.indexer.DefaultIndexer',
            'server.index.indexer.DecimalXPathIndexer',
            'server.index.indexer.TimeXPathIndexer',
            'server.index.indexer.ReverseStringIndexer',
            'server.index.indexer.ReverseCompleteStringIndexer',
            'server.index.indexer.ParentFolderPathIndexer',
            'server.index.indexer.DateTimeIndexer',
            'server.index.indexer.DescendingReverseStringIndexer',
            'server.index.indexer.DescendingReverseCompleteStringIndexer',
            'server.index.indexer.DescendingStringIndexer',
            'server.index.indexer.DescendingCompleteStringIndexer'
]

vaProviders = [
            'server.index.valueAssistance.DefaultProvider',
]


triggerClasses = [
        'server.trigger.impl.RelationChangeTrigger'
]

relationResolvers = [
        'server.resolver.FixedRelationResolver',
        'server.resolver.LatestHeadResolver',
        'server.resolver.LatestBranchResolver'
]

transformers = [
        'server.transformation.XhtmlToPdfTransformer'
]

lifeCycleStateClasses = [
        'server.lifecycle.state.NopState',
        'server.lifecycle.state.ChangeAclState'
]