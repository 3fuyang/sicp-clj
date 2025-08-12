(ns sicp-clj.ch-1
  (:require [sicp-clj.ch-1.sqrt :as sqrt]
            [sicp-clj.ch-1.excs-new-if :as new-sqrt]
            [sicp-clj.ch-1.sqrt-block-struct :as sqrt-block-struct]))

;; Re-export main functions for convenience
(def sqrt sqrt/sqrt)
(def new-sqrt new-sqrt/new-sqrt)
(def sqrt-block-struct sqrt-block-struct/sqrt)
