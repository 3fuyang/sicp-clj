(ns sicp-clj.ch-1
  (:require [sicp-clj.ch-1.sqrt :as sqrt]
            [sicp-clj.ch-1.excs-new-if :as new-sqrt]
            [sicp-clj.ch-1.sqrt-block-struct :as sqrt-block-struct]
            [sicp-clj.ch-1.factorial :as factorial]
            [sicp-clj.ch-1.factorial-iter :as factorial-iter]
            [sicp-clj.ch-1.fast-prime :as fast-prime]
            [sicp-clj.ch-1.fast-expt :as fast-expt]))

;; Re-export main functions for convenience
(def sqrt sqrt/sqrt)
(def new-sqrt new-sqrt/new-sqrt)
(def sqrt-block-struct sqrt-block-struct/sqrt)
(def factorial factorial/factorial)
(def factorial-iter factorial-iter/factorial)
(def fast-prime fast-prime/fast-prime?)
(def fast-expt fast-expt/fast-expt)
