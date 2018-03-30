(ns clojure-lsp.clojure-core)

(def core-syms
  '#{*
     *1
     *2
     *3
     *agent*
     *clojure-version*
     *command-line-args*
     *compile-files*
     *compile-path*
     *e
     *err*
     *file*
     *in*
     *ns*
     *out*
     *print-dup*
     *print-length*
     *print-level*
     *print-meta*
     *print-readably*
     *warn-on-reflection*
     +
     -
     ->
     ->>
     ..
     /
     <
     <=
     =
     ==
     >
     >=
     accessor
     aclone
     add-watch
     agent
     agent-error
     agent-errors
     aget
     alength
     alias
     all-ns
     alter
     alter-meta!
     alter-var-root
     amap
     ancestors
     and
     apply
     areduce
     array-map
     as->
     aset
     aset-boolean
     aset-byte
     aset-char
     aset-double
     aset-float
     aset-int
     aset-long
     aset-short
     assert
     assoc
     assoc!
     assoc-in
     associative?
     atom
     await
     await-for
     bases
     bean
     bigdec
     bigdec?
     bigint
     binding
     bit-and
     bit-and-not
     bit-clear
     bit-flip
     bit-not
     bit-or
     bit-set
     bit-shift-left
     bit-shift-right
     bit-test
     bit-xor
     boolean
     boolean-array
     booleans
     bound-fn
     bound-fn*
     bound?
     butlast
     byte
     byte-array
     bytes
     case
     cast
     catch
     char
     char-array
     char?
     chars
     class
     class?
     clojure-version
     coll?
     commute
     comp
     comparator
     compare
     compare-and-set!
     compile
     complement
     concat
     cond
     cond->
     cond->>
     condp
     conj
     conj!
     cons
     constantly
     construct-proxy
     contains?
     count
     counted?
     create-ns
     create-struct
     cycle
     dec
     decimal?
     declare
     dedupe
     def
     definline
     defmacro
     defmethod
     defmulti
     defn
     defn-
     defonce
     defprotocol
     defrecord
     defstruct
     deftype
     delay
     delay?
     deliver
     denominator
     deref
     derive
     descendants
     disj
     disj!
     dissoc
     dissoc!
     distinct
     distinct?
     do
     doall
     dorun
     doseq
     dosync
     dotimes
     doto
     double
     double-array
     double?
     doubles
     drop
     drop-last
     drop-while
     eduction
     empty
     empty?
     ensure
     enumeration-seq
     error-handler
     error-mode
     eval
     even?
     every-pred
     every?
     extend
     extend-protocol
     extend-type
     extenders
     extends?
     false?
     ffirst
     file-seq
     filter
     filterv
     finally
     find
     find-ns
     find-var
     first
     flatten
     float
     float-array
     float?
     floats
     flush
     fn
     fn?
     fnext
     fnil
     for
     force
     format
     frequencies
     future
     future-call
     future-cancel
     future-cancelled?
     future-done?
     future?
     gen-class
     gen-interface
     gensym
     get
     get-in
     get-method
     get-proxy-class
     get-thread-bindings
     get-validator
     group-by
     hash
     hash-map
     hash-set
     ident?
     identical?
     identity
     if
     if-let
     if-not
     if-some
     ifn?
     import
     in-ns
     inc
     init-proxy
     instance?
     int
     int-array
     int?
     integer?
     interleave
     intern
     interpose
     into
     into-array
     ints
     io!
     isa?
     iterate
     iterator-seq
     juxt
     keep
     keep-indexed
     key
     keys
     keyword
     keyword?
     last
     lazy-cat
     lazy-seq
     let
     letfn
     line-seq
     list
     list*
     list?
     load
     load-file
     load-reader
     load-string
     loaded-libs
     locking
     long
     long-array
     longs
     loop
     macroexpand
     macroexpand-1
     make-array
     make-hierarchy
     map
     map-indexed
     map?
     mapcat
     mapv
     max
     max-key
     memfn
     memoize
     merge
     merge-with
     meta
     methods
     min
     min-key
     mod
     name
     namespace
     namespace-munge
     nat-int?
     neg?
     newline
     next
     nfirst
     nil?
     nnext
     not
     not-any?
     not-empty
     not-every?
     not=
     ns
     ns-aliases
     ns-imports
     ns-interns
     ns-map
     ns-name
     ns-publics
     ns-refers
     ns-resolve
     ns-unalias
     ns-unmap
     nth
     nthnext
     nthrest
     num
     number?
     numerator
     object-array
     odd?
     or
     parents
     partial
     partition
     partition-all
     partition-by
     pcalls
     peek
     persistent!
     pmap
     pop
     pop!
     pop-thread-bindings
     pos-int?
     pos?
     pr
     pr-str
     prefer-method
     prefers
     print
     print-str
     printf
     println
     println-str
     prn
     prn-str
     promise
     proxy
     proxy-mappings
     proxy-super
     push-thread-bindings
     pvalues
     qualified-ident?
     qualified-keyword?
     qualified-symbol?
     quot
     rand
     rand-int
     rand-nth
     random-sample
     range
     ratio?
     rational?
     rationalize
     re-find
     re-groups
     re-matcher
     re-matches
     re-pattern
     re-seq
     read
     read-line
     read-string
     recur
     reduce
     reduce-kv
     reductions
     ref
     ref-history-count
     ref-max-history
     ref-min-history
     ref-set
     refer
     refer-clojure
     reify
     release-pending-sends
     rem
     remove
     remove-all-methods
     remove-method
     remove-ns
     remove-watch
     repeat
     repeatedly
     replace
     replicate
     require
     reset!
     reset-meta!
     resolve
     rest
     restart-agent
     resultset-seq
     reverse
     reversible?
     rseq
     rsubseq
     satisfies?
     second
     select-keys
     send
     send-off
     seq
     seq?
     seqable?
     seque
     sequence
     sequential?
     set
     set!
     set-error-handler!
     set-error-mode!
     set-validator!
     set?
     short
     short-array
     shorts
     shuffle
     shutdown-agents
     simple-ident?
     simple-keyword?
     simple-symbol?
     slurp
     some
     some->
     some->>
     some-fn
     sort
     sort-by
     sorted-map
     sorted-map-by
     sorted-set
     sorted-set-by
     sorted?
     special-symbol?
     spit
     split-at
     split-with
     str
     string?
     struct
     struct-map
     subs
     subseq
     subvec
     supers
     swap!
     symbol
     symbol?
     sync
     take
     take-last
     take-nth
     take-while
     test
     the-ns
     thread-bound?
     throw
     time
     to-array
     to-array-2d
     trampoline
     transduce
     transient
     tree-seq
     true?
     try
     type
     underive
     update
     update-in
     update-proxy
     use
     val
     vals
     var
     var-get
     var?
     vary-meta
     vec
     vector
     vector-of
     vector?
     volatile!
     vreset!
     vswap!
     when
     when-first
     when-let
     when-not
     when-some
     while
     with-bindings
     with-bindings*
     with-in-str
     with-local-vars
     with-meta
     with-open
     with-out-str
     with-precision
     xml-seq
     zero?
     zipmap})
